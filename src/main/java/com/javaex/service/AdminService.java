package com.javaex.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.dao.AdminDao;
import com.javaex.vo.GoodsVo;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;

	// 상품 목록 가져오기
	public List<GoodsVo> getAllGoods() {
		return adminDao.getGoodsList();
	}

	// 상품 추가 로직 (이미지 파일 처리 포함)
	/*
	 * public void addGoodsWithImage(GoodsVo goodsVo, MultipartFile image) { if
	 * (image != null && !image.isEmpty()) { try { // 이미지 파일 처리 String imageName =
	 * image.getOriginalFilename(); goodsVo.setImgName(imageName);
	 * 
	 * // 파일 저장 (실제 업로드 경로 설정) String uploadDir = "C:/javaStudy/upload"; // 실제 파일
	 * 업로드 경로 File uploadFile = new File(uploadDir, imageName);
	 * image.transferTo(uploadFile);
	 * 
	 * // 이미지 크기 저장 (파일 크기 예시) goodsVo.setImgSize(uploadFile.length());
	 * 
	 * // 이미지 경로 저장 (절대 경로 or 상대 경로 선택) Path imgPath = Paths.get(uploadDir,
	 * imageName); goodsVo.setImgPath(imgPath.toString()); // imgPath 저장
	 * 
	 * 
	 * } catch (IOException e) { e.printStackTrace(); throw new
	 * RuntimeException("파일 저장 중 오류 발생"); } }
	 * 
	 * // 상품 정보 저장 adminDao.save(goodsVo); }
	 */
	public void addGoodsWithImage(GoodsVo goodsVo, MultipartFile image) {
		if (image != null && !image.isEmpty()) {
			try {
				// 이미지 파일 처리
				String imageName = image.getOriginalFilename();
				goodsVo.setImgName(imageName);

				// 파일 저장 경로 (프로젝트 내의 "upload" 폴더로 지정)
				String uploadDir = new File("upload").getAbsolutePath(); // 프로젝트 루트에 "upload" 폴더
				File uploadFile = new File(uploadDir, imageName);

				// "upload" 폴더가 존재하지 않으면 생성
				if (!uploadFile.getParentFile().exists()) {
					uploadFile.getParentFile().mkdirs();
				}

				// 파일을 저장
				image.transferTo(uploadFile);

				// 파일 크기 저장
				goodsVo.setImgSize(uploadFile.length());

				// 이미지 경로 저장 (상대 경로로 저장)
				String imgPath = uploadDir + imageName; // 상대 경로로 저장
				goodsVo.setImgPath(imgPath); // imgPath 저장

			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException("파일 저장 중 오류 발생");
			}
		}

		// 상품 정보 저장
		adminDao.save(goodsVo);
	}
}
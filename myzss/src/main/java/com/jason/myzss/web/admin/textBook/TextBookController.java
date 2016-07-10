package com.jason.myzss.web.admin.textBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.TextBook;
import com.jason.myzss.service.textBook.TextBookService;

@RestController
@RequestMapping("/admin/textBook")
public class TextBookController {
	
	@Autowired
	private TextBookService textBookService;
	
	@RequestMapping("/getTextBookPage")
	public Page<TextBook> getTextBookPage(
			@RequestParam("stage") Byte stage, 
			@RequestParam("subjectId") Long subjectId,
			@RequestParam("versionId") Long versionId,
			@RequestParam("number") Integer page) {
		Pageable pageable = new PageRequest(page, 10);
		if(stage!=0&&subjectId!=0&&versionId==0)return textBookService.findBySubjectId(pageable, subjectId);
		if(versionId!=0)return textBookService.findByVersionId(pageable, versionId);
		return textBookService.findAll(pageable);
	}

}

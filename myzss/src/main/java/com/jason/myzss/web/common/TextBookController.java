package com.jason.myzss.web.common;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jason.myzss.domain.TextBook;
import com.jason.myzss.service.textBook.TextBookService;

@RestController
@RequestMapping("/common")
public class TextBookController {

	@Autowired
	private TextBookService textBookService;
	
	@RequestMapping("/version/{versionId}/textbooks")
	public List<TextBook> findByVersionId(@PathVariable("versionId")Long versionId){
		return textBookService.findByVersionId(versionId);
	}
}

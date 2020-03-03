package io.youngwon.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.youngwon.core.BoardService;

@RestController
public class MainController {
	private final BoardService boardService;
	 
	
	public MainController(BoardService boardService) {
		this.boardService = boardService;
	}
	
 
    @GetMapping("/")
    public String isEvenOrOdd() {
        return boardService.getMessage();
    }
}

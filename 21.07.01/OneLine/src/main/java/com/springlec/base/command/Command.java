package com.springlec.base.command;

import org.springframework.ui.Model;

public interface Command {
	
	void execute(Model model);

}

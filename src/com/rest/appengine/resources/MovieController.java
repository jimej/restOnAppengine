package com.rest.appengine.resources;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gdata.data.spreadsheet.ListEntry;
import com.google.gdata.data.spreadsheet.ListFeed;
import com.google.gdata.util.ServiceException;
import com.rest.appengine.service.ReadSpreadsheet;

@Controller
@RequestMapping("/movie")
public class MovieController {
 
	//DI via Spring
	String message;
 
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	@ResponseBody
	public String getMovie(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("movie", name);
		model.addAttribute("message", this.message);
 
		ListFeed feed = null;
		//return to jsp page, configured in spring-config.xml, view resolver
		try {
			feed = ReadSpreadsheet.readSP();
		} catch (IOException | ServiceException e) {
			// TODO Auto-generated catch block
			return e.toString();
		}
		if(feed == null) return "no results";
		StringBuilder sb = new StringBuilder();
		for(ListEntry entry : feed.getEntries())
		{
	      sb.append("\n");
		  sb.append("new row: ");
		  for(String tag : entry.getCustomElements().getTags())
		  {
		  sb.append(" "+tag + ": " + entry.getCustomElements().getValue(tag));
		  }
		}
		
		return sb.toString();
 
	}
 
	public void setMessage(String message) {
		this.message = message;
	}
 
}

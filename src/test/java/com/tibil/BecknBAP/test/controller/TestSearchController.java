package com.tibil.BecknBAP.test.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
@AutoConfigureMockMvc
public class TestSearchController {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void errorRequestWithNoDesignation() throws Exception {
		
		String body = """
				{"experience": 1, "technologies": ["java", "SQL"]}
				""";
		
		MvcResult result = mockMvc.perform(
				post("/search")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(body)
			).andDo(print()).andReturn();
		
		assert(result.getResponse().getStatus() == HttpStatus.BAD_REQUEST.value());
		assert(result.getResponse().getContentAsString().contains("Provide a designation"));
	}
	
	@Test
	public void errorRequestWithInvalidExperience() throws Exception {
		
		String body = """
				{"designation": "Java Developer", "experience": "abc", "technologies": ["java", "SQL"]}
				""";
		
		MvcResult result = mockMvc.perform(
				post("/search")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(body)
			).andDo(print()).andReturn();
		
		assert(result.getResponse().getStatus() == HttpStatus.BAD_REQUEST.value());
		assert(result.getResponse().getContentAsString().contains("JSON parse error"));
	}
	
	@Test
	public void errorRequestWithNoTechnologies() throws Exception {
		
		String body = """
				{"designation": "Java Developer", "experience": 5}
				""";
		
		MvcResult result = mockMvc.perform(
				post("/search")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(body)
			).andDo(print()).andReturn();
		
		assert(result.getResponse().getStatus() == HttpStatus.BAD_REQUEST.value());
		assert(result.getResponse().getContentAsString().contains("Provide aleast one technology"));
	}
	
	@Test
	public void errorRequestWithTechnologiesNotAsList() throws Exception {
		
		String body = """
				{"designation": "Java Developer", "experience": 5, "technologies": "Java"}
				""";
		
		MvcResult result = mockMvc.perform(
				post("/search")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(body)
			).andDo(print()).andReturn();
		
		assert(result.getResponse().getStatus() == HttpStatus.BAD_REQUEST.value());
		assert(result.getResponse().getContentAsString().contains("JSON parse error"));
	}
	
	@Test
	public void errorRequestWithValidRequest() throws Exception {
		
		String body = """
				{"designation": "Java Developer", "experience": 5, "technologies": ["java", "SQL"]}
				""";
		
		MvcResult result = mockMvc.perform(
				post("/search")
				.accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				.content(body)
			).andDo(print()).andReturn();
		
		assert(result.getResponse().getStatus() == HttpStatus.OK.value());
	}
	

}

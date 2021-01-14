package com.fundulearobertionut.musicality.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SongsTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testGet() throws Exception {
        RequestBuilder builder = MockMvcRequestBuilders.get("/songs");
        MvcResult result = mvc.perform(builder).andReturn();
        Assert.assertEquals("[]", result.getResponse().getContentAsString());
    }
}

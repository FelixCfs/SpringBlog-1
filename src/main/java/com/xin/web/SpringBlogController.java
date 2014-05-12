package com.xin.web;

import com.sun.deploy.net.HttpResponse;
import com.xin.model.Post;
import com.xin.model.User;
import com.xin.service.SpringBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Xin
 * Date: 14-5-5
 * Time: 上午10:10
 */

@Controller
public class SpringBlogController {

    @Autowired
    private SpringBlogService springBlogService;

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("blog.index");
    }


    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public @ResponseBody Map<String,Object> findAllPost(){

        Map<String,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("posts",this.springBlogService.findAllPost());
        return resultMap;

    }


    @RequestMapping(value = "/post/{postId}", method = RequestMethod.GET)
    public ModelAndView findPost(@PathVariable Long postId){

        Map<String,Object> model = new HashMap<String, Object>();

        Post post = this.springBlogService.findPostById(postId);
        User author = this.springBlogService.findUserById(post.getAuthorId());
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        String postDate = dateformat.format(post.getPostDate());


        model.put("post",post);
        model.put("author",author.getUserName());
        model.put("postDate",postDate);

        return new ModelAndView("blog.post", model);
    }

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public @ResponseBody Map<String,Object> findAllCategory(){

        Map<String,Object> resultMap = new HashMap<String, Object>();
        resultMap.put("categories",this.springBlogService.findAllCategory());
        return resultMap;

    }

}

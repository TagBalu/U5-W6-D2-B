package vacislavbaluyev.u5d7.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vacislavbaluyev.u5d7.entities.Blog;
import vacislavbaluyev.u5d7.payloads.NewBlogPost;
import vacislavbaluyev.u5d7.services.BlogService;

import java.util.List;

@RestController

@RequestMapping("/blogPost")
public class BlogController {
    @Autowired
    private BlogService blogService;
    //1. GET http://localhost:3001/blogPost
    @GetMapping
    public List<Blog> getBlogs() {
        return this.blogService.findAll();
    }

    @PostMapping
    public Blog newBlogPost(@RequestBody NewBlogPost body) {
       return this.blogService.saveBlog(body);
    }

}

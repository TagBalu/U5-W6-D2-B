package vacislavbaluyev.u5d7.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import vacislavbaluyev.u5d7.entities.Blog;
import vacislavbaluyev.u5d7.payloads.NewBlogPost;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class BlogService {
    private final List<Blog> blogList = new ArrayList<>();


    public List<Blog> findAll() {
        return this.blogList;
    }

    public Blog saveBlog(NewBlogPost payload){
        Blog blog = new Blog(payload.getCategoria(), payload.getTitolo(), "https://picsum.photos/200/300", payload.getContenuto(), payload.getTempoDiLettura());
        this.blogList.add(blog);
        log.info("Blog salvato: " + blog);
        return blog;
    }
}

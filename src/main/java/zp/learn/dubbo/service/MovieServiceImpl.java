package zp.learn.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import zp.learn.dubbo.bean.Movie;

/**
 * @author zp
 * @Description:
 * @date 2019-12-02 16:07
 */
@Component
@Service
public class MovieServiceImpl implements MovieService {

    @Override
    public Movie getNewMovie() {

        System.out.println("方法被远程调用");
        Movie movie = new Movie();
        movie.setId(1);
        movie.setMovieName("少年的你");
        movie.setPrice(48);


        return movie;
    }
}
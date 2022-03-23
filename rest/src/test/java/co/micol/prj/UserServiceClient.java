package co.micol.prj;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.micol.prj.user.service.UserService;
import co.micol.prj.user.service.UserVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/config/*-context.xml")
public class UserServiceClient {

	@Autowired
	UserService userSer;
	
	@Test
	public void list() {
		List<UserVO> list = userSer.getUserList(null);
		System.out.println(list);
	}
}

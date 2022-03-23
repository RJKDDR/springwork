package co.micol.prj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.micol.prj.member.mapper.MemberMapper;
import co.micol.prj.member.service.MemberVO;
import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/config/*-context.xml")
public class MemberMapperClient {
	
	@Autowired MemberMapper map;
	
	@org.junit.Before
	public void setUp() {
		MemberVO vo = new MemberVO();
		vo.setName("rrrr");
		vo.setPassword("22222");
		vo.setId("ddddddd");
		vo.setAuthor("USER");
		map.memberDelete(vo);
	}
	
	//@Test
//	public void listTest() {
//		List<MemberVO> list= map.memberSelectList();
//		System.out.println(list);
//	}
//	@Test
//	public void selectTest() {
//		MemberVO vo = new MemberVO();
//		vo.setPassword("22222");
//		vo.setId("ddddddd");
//	      vo = map.memberSelect(vo);
//	      System.out.println(vo);
//	      assertEquals(vo.getId(), "ddddddd");
//	   }
	@Test
	public void listTest() {
		MemberVO vo = new MemberVO();
		vo.setName("rrrr");
		vo.setPassword("22222");
		vo.setId("ddddddd");
		vo.setAuthor("USER");
		int r = map.memberInsert(vo);
		assertEquals(r, 1);
		System.out.println(vo);
		//Assert.assertEquals(map.memberSelect(vo), vo);
		
	}
}

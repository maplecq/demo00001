package permission;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hwua.dao.UsersMapper;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UsersMapper mapper=ctx.getBean("usersDaoImpl", UsersMapper.class);
		mapper.selectByPrimaryKey(1);
	}

}

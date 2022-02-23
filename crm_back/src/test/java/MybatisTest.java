import com.kerlin.domain.Department;
import com.kerlin.domain.Employee;
import com.kerlin.mapper.DepartmentMapper;
import com.kerlin.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MybatisTest {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void selectAllTest(){
        System.out.println(departmentMapper.selectAll());
    }

    @Test
    public void deleteTest(){

        departmentMapper.delete(1L);
    }

    @Test
    public void saveTest(){
        Department department = new Department("lisi", "xy");
        departmentMapper.save(department);
    }

    @Test
    public void updateTest(){
        Department department = new Department(2L,"zhangsan", "xy");
        departmentMapper.update(department);
    }

    @Test
    public void getOneTest(){
        System.out.println(departmentMapper.getOne(1L));
    }

    @Test
    public void queryCountTest(){
        System.out.println(departmentMapper.queryCount());
    }

//    员工部分
    @Test
    public void eminsertTest(){
        Employee employee= new Employee("360", "234","3345@360.com",44,true,2L);
        employeeMapper.insert(employee);
    }
    @Test
    public void emdeleteTest(){
        System.out.println(departmentMapper.selectAll());
    }
    @Test
    public void emupdateTest(){
        Employee employee= new Employee(3L,"兔兔", "234","3345@360.com",44,true,2L);
        employeeMapper.update(employee);
    }
    @Test
    public void emselectByIdTest(){
        System.out.println(employeeMapper.selectById(3L));
    }
    @Test
    public void emqueryCountTest(){
        System.out.println(employeeMapper.queryCount());
    }
    @Test
    public void emselectAllTest(){
        System.out.println(employeeMapper.selectAll());
    }
}

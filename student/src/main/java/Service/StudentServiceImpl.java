package Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  

import DAO.StudentDao;
import Model.Student;

@Service
@Transactional  
public class StudentServiceImpl implements StudentService {

	 @Autowired  
	    private StudentDao studentdao;  
	      
	    @Override  
	    public boolean saveStudent(Student student) {  
	        return studentdao.saveStudent(student);  
	    }  
	  
	    @Override  
	    public List<Student> getStudents() {  
	        return studentdao.getStudents();  
	    }  
	  
	    @Override  
	    public boolean deleteStudent(Student student) {  
	        return studentdao.deleteStudent(student);  
	    }  
	  
	    @Override  
	    public List<Student> getStudentByID(Student student) {  
	        return studentdao.getStudentByID(student);  
	    }  
	  
	    @Override  
	    public boolean updateStudent(Student student) {  
	        return studentdao.updateStudent(student);  
	    }  
}

package mapper;
	
import java.util.List;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface PostMapper {
		
	public void insertPost(String content);
	public List<String> selectPosts();

}


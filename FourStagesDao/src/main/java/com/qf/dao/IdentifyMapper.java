import com.qf.pojo.Identify;
import com.qf.pojo.IdentifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IdentifyMapper {
    int countByExample(IdentifyExample example);

    int deleteByExample(IdentifyExample example);

    int deleteByPrimaryKey(Integer identifyid);

    int insert(Identify record);

    int insertSelective(Identify record);

    List<Identify> selectByExample(IdentifyExample example);

    Identify selectByPrimaryKey(Integer identifyid);

    int updateByExampleSelective(@Param("record") Identify record, @Param("example") IdentifyExample example);

    int updateByExample(@Param("record") Identify record, @Param("example") IdentifyExample example);

    int updateByPrimaryKeySelective(Identify record);

    int updateByPrimaryKey(Identify record);
}
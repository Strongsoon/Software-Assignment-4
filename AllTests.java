import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestAddPostInvalid.class, TestInvalidBody.class, TestInvalidCase.class, TestInvalidComment.class,
		TestInvalidPostType.class, TestInvalidTag.class, TestInvalidTagCount.class, TestInvalidTagFormat.class,
		TestInvalidTitle.class, TestTooManyComments.class, TestValidComment.class, TestValidPost.class })
public class AllTests {

}

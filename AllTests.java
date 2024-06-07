import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TestAddPostInvalid.class, TestCommentLength.class, TestCommentNumberEasy.class,
		TestCommentNumberHighly.class, TestCommentWordCount.class, TestEmergencyType.class, TestInvalidBody.class,
		TestInvalidComment.class, TestInvalidInput.class, TestInvalidPostType.class, TestInvalidTag.class,
		TestTooManyComments.class })
public class AllTests {

}

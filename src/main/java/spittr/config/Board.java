package spittr.config;



/**
 * @author xiaoyaoyao
 *  论坛版块
 *
 */
public class Board extends BaseDomain {

	private long boardId;
	private String boardName;
	private String boardDesc;
	private int topicNum;
	private MainPost mainPost;
	
	public long getBoardId() {
		return boardId;
	}
	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public String getBoardDesc() {
		return boardDesc;
	}
	public void setBoardDesc(String boardDesc) {
		this.boardDesc = boardDesc;
	}
	public int getTopicNum() {
		return topicNum;
	}
	public void setTopicNum(int topicNum) {
		this.topicNum = topicNum;
	}
	public MainPost getMainPost() {
		return mainPost;
	}
	public void setMainPost(MainPost mainPost) {
		this.mainPost = mainPost;
	}
	

}

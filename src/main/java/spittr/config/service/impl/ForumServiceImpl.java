package spittr.config.service.impl;

import java.util.List;

import spittr.config.Board;
import spittr.config.Page;
import spittr.config.Post;
import spittr.config.Topic;
import spittr.config.dao.BoardDao;
import spittr.config.dao.PostDao;
import spittr.config.dao.TopicDao;
import spittr.config.dao.UserDao;
import spittr.config.service.ForumService;

public class ForumServiceImpl implements ForumService {

	private TopicDao topicDao;
	private BoardDao boardDao;
	private PostDao postDao;
	private UserDao userDao;

	public void addTopic(Topic topic) {

	}

	public void removeTopic(int topicId) {

	}

	public void addPost(Post post) {

	}

	public void removePost(int postId) {

	}

	public void addBoard(Board boardId) {

	}

	public void removeBoard(int boardId) {

	}

	public void makeDigestTopic(int topicId) {

	}

	public List<Board> getAllBoards() {
		return null;
	}

	public Page getPagedTopics(int boardId, int pageNo, int pageSize) {
		return null;
	}

	public Page getPagedPosts(int topicId, int pageNo, int pageSize) {
		return null;
	}

	public Page queryTopicByTitle(String title, int pageNo, int pageSize) {
		return null;
	}

	public Board getBoardById(int boardId) {
		return null;
	}

	public Topic geTopicByTopicId(int topicId) {
		return null;
	}

	public Post getPostByPostId(int postId) {
		return null;
	}

	public void addBoardManager(int boardId, String userName) {

	}

	public void updateTopic(Topic topic) {

	}

	public void updatePost(Post post) {
		
	}

}

package com.example.hello;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;

	/*
	 * @GetMapping("/comments") public List<Student> getAllComments() { return
	 * studentRepository.findAll(); }
	 */

	/*
	 * @PostMapping("/comments") public Comment createComment(@RequestBody Comment
	 * comment) { return commentRepository.save(comment); }
	 */

	@GetMapping("/comments/{id}")
	public Optional<Student> getCommentById(@PathVariable(value = "id") Long commentId) {
		System.out.println("asdfghjkdfghj---------------------------------");
		System.out.println("find all--------- " + studentRepository.findAll());
		System.out.println("find all--------- " + studentRepository.findAll().toString());
		System.out.println("comment id  --------- " + commentId);
		System.out.println("native querry    --------- " + studentRepository.findStudentById());
		return studentRepository.findById(commentId);
				
	}

	/*
	 * @PutMapping("/comments/{id}") public Comment
	 * updateComment(@PathVariable(value = "id") Long commentId, @RequestBody
	 * Comment commentDetails) {
	 * 
	 * Comment comment = commentRepository.findById(commentId) .orElseThrow(() ->
	 * new ResourceNotFoundException("Comment", "id", commentId));
	 * 
	 * comment.setPostName(commentDetails.getPostName());
	 * comment.setComment(commentDetails.getComment());
	 * 
	 * Comment updatedComment = commentRepository.save(comment); return
	 * updatedComment; }
	 */

	/*
	 * @DeleteMapping("/comments/{id}") public ResponseEntity<?>
	 * deleteComment(@PathVariable(value = "id") Long commentId) { Comment comment =
	 * commentRepository.findById(commentId) .orElseThrow(() -> new
	 * ResourceNotFoundException("Comment", "id", commentId));
	 * 
	 * commentRepository.delete(comment);
	 * 
	 * return ResponseEntity.ok().build(); }
	 */
}
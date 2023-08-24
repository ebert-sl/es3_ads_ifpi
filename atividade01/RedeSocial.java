package atividade01;

public class RedeSocial {
  public static void main(String[] args) {
    Post post = new Post(1, "Hello World", Status.DRAFT);
    post.publish();
    System.out.println("Successfully published text");
	}
}

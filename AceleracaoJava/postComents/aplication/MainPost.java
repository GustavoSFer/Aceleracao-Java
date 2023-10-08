package aplication;

import java.time.LocalDateTime;
import entities.Coment;
import entities.Post;

public class MainPost {

  public static void main(String[] args) {
    // Fazendo tudo manualmente
    LocalDateTime agora = LocalDateTime.now();
    Post post1 = new Post(agora, "Meu primeiro posta no blog.");
    post1.addComentario(new Coment("Muito bom esse post!"));
    post1.addComentario(new Coment("Parabens"));
    post1.addComentario(new Coment("Posta mais..."));

    System.out.println(post1);
  }

}

package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {
  private LocalDateTime data;
  private String text;
  private List<Coment> comentarios = new ArrayList<>();

  public Post(LocalDateTime data, String text) {
    this.data = data;
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public LocalDateTime getData() {
    return data;
  }

  public List<Coment> getComentarios() {
    return comentarios;
  }

  public void addComentario(Coment comentario) {
    this.comentarios.add(comentario);
  }

  public void removeComentario(Coment comentario) {
    this.comentarios.remove(comentario);
  }
}

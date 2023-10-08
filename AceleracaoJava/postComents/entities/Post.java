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

  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append(this.text + "\n");
    str.append("Postado em: " + this.data + "\n\n");
    str.append("== Comentarios: ==\n");

    for (Coment c : comentarios) {
      str.append(c.getComentario() + "\n");
    }
    return str.toString();
  }
}

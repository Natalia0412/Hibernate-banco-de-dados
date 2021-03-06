package br.com.etechoracio.jpa.view;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.context.FacesContextFactory;
import javax.faces.view.facelets.FaceletContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.etechoracio.jpa.model.Funcionario;

@ManagedBean
public class FuncionarioMB {
	private Funcionario edit = new Funcionario();

	public Funcionario getEdit() {
		return edit;
	}

	public void setEdit(Funcionario edit) {
		this.edit = edit;
	}

	private void showInsertMessage() {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage("Registro inserido com sucesso");
		context.addMessage(null, message);

	}

	public void doSave() {
		edit.setDataCadastro(new Date());
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("ETEC");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(edit);
		em.getTransaction().commit();
		em.close();
		showInsertMessage();
	}

}

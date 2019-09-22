package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Banker;
import service.BankerEJB;

@ManagedBean(name = "bankercontroller")
@SessionScoped
public class BankerController {

	@EJB
	private BankerEJB bankerEJB;

	// from form
	@ManagedProperty(value = "#{banker}")
	private Banker banker;

	private List<Banker> bankerList = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public List<Banker> getbankerList() {
		bankerList = bankerEJB.findBankers();
		return bankerList;
	}

	public String viewBanker() {
		return "bankerList.xhtml";
	}

	@SuppressWarnings("unchecked")
	public String addNewBanker() {

		bankerEJB.addNew(banker.getEntity());
		bankerList = bankerEJB.findBankers();
		return "bankerList.xhtml";
	}

	public Banker getBanker() {
		return banker;
	}

	public void setBanker(Banker banker) {
		this.banker = banker;
	}

}
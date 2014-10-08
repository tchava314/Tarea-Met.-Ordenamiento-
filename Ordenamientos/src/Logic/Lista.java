package Logic;

import java.util.Random;

public class Lista<Ele> {

	Nodo<Ele> head;
	protected int size;

	public Lista() {
		head = null;
		size = 0;
	}

	public Ele getObject(int pos) {
		int count = 0;
		Nodo<Ele> temp = head;

		while (count < pos) {
			temp = temp.getNext();
			count++;
		}
		return temp.getData();
	}

	public void addDataBegin(Ele newObject) {

		if (head == null) {
			head = new Nodo<Ele>(newObject);
		}

		else {
			Nodo<Ele> temp = head;
			Nodo<Ele> newNode = new Nodo<Ele>(newObject);
			newNode.setNext(temp);
			head = newNode;
			size++;
		}

	}

	public void addDataEnd(Ele newObject) {

		if (head == null) {
			head = new Nodo<Ele>(newObject);
		}

		else {
			Nodo<Ele> temp = head;
			Nodo<Ele> newNode = new Nodo<Ele>(newObject);

			while (temp.getNext() != null) {
				temp = temp.getNext();
			}

			temp.setNext(newNode);
		}
		size++;
	}

	public void eliminar(Ele letra) {
		Nodo<Ele> act = head, ant = null;
		boolean find = false;
		while ((act != null) && (!find)) {
			find = (act.getData() == letra);
			if (!find) {
				ant = act;
				act = act.getNext();
			}
		}
		if (act != null) {
			if (act == head) {
				head = act.getNext();
			} else {
				ant.setNext(act.getNext());
			}
			act = null;

		}

		size = size - 1;
	}

	public boolean isEmpy() {
		if (head == null)
			return true;
		else
			return false;
	}

	public int getSize() {
		return size;
	}

	public Ele EleAzar() {// metodo que devuelve un elemento al azar
		Random azar = new Random();
		int pos = azar.nextInt(this.getSize());
		Ele x = this.getObject(pos);
		// this.eliminar(x);
		return x;

	}// fin metodo fichaAzar

}

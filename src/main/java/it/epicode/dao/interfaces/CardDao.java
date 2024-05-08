package it.epicode.dao.interfaces;

import it.epicode.classi.Card;

public interface CardDao {
    void save(Card card);

    public Card getCardById(Long id);
}

package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

    private final Suit DUMMY_SUIT = Suit.DIAMONDS;

    @Test
    public void handWithOneAceTwoCardsIsValuedAt11() throws Exception {
        Hand hand = new Hand(List.of(new Card(DUMMY_SUIT, "A"),
                                     new Card(DUMMY_SUIT, "5")));
        assertThat(hand.value())
                .isEqualTo(11 + 5);
    }

    @Test
    public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
        Hand hand = new Hand(List.of(new Card(DUMMY_SUIT, "A"),
                                     new Card(DUMMY_SUIT, "8"),
                                     new Card(DUMMY_SUIT, "3")));
        assertThat(hand.value())
                .isEqualTo(1 + 8 + 3);

        //assertThat(hand.isValueEqualTo(1 + 8 + 3));
    }

}

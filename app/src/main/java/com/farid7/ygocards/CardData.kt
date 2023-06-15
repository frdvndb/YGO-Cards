package com.farid7.ygocards

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CardData(
    val cardImage: Int,
    val cardName: String,
    val cardType: String,
    val cardSubType: String,
    val cardAtkDef: String,
    val cardDescription: String
) : Parcelable

val listCardKashtira = listOf<CardData>(
    CardData(
        R.drawable.card_kashtira_ariseheart,
        "Kashtira Arise-Heart",
        "Xyz/Effect Monster", "Machine", "3000/3000",
        "3 Level 7 monsters\n" +
                "Once per turn, you can also Xyz Summon \"Kashtira Arise-Heart\" by using 1 \"Kashtira\" monster you control, if an effect of \"Kashtira Shangri-Ira\" was successfully activated this turn. (Transfer its materials to this card.) Any card sent to the GY is banished instead. Once per Chain, each time a card(s) is banished: Attach 1 banished card to this card as material. Once per turn (Quick Effect): You can detach 3 materials from this card, then target 1 card on the field; banish it face-down."
    ),
    CardData(
        R.drawable.card_kashtira_fenrir,
        "Kashtira Fenrir",
        "Effect Monster", "Psychic", "2400/2400",
        "\tIf you control no monsters, you can Special Summon this card (from your hand). You can only use each of the following effects of \"Kashtira Fenrir\" once per turn. During your Main Phase: You can add 1 \"Kashtira\" monster from your Deck to your hand. When this card declares an attack, or if your opponent activates a monster effect (except during the Damage Step): ..."
    ),
    CardData(
        R.drawable.card_kashtira_unicorn,
        "Kashtira Unicorn",
        "Effect Monster", "Psychic", "2500/2100",
        "If you control no monsters, you can Special Summon this card (from your hand). You can only use each of the following effects of \"Kashtira Unicorn\" once per turn. During your Main Phase: You can add 1 \"Kashtira\" Spell from your Deck to your hand. When this card declares an attack, or if your opponent activates a monster effect (except during the Damage Step): ..."
    ),
    CardData(
        R.drawable.card_kashtira_ogre,
        "Kashtira Ogre",
        "Effect Monster", "Psychic", "2800/1000",
        "If you control no monsters, you can Special Summon this card (from your hand). You can only use each of the following effects of \"Kashtira Ogre\" once per turn. During your Main Phase: You can add 1 \"Kashtira\" Trap from your Deck to your hand. When this card declares an attack, or if your opponent activates a monster effect (except during the Damage Step): ..."
    ),
    CardData(
        R.drawable.card_kashtira_shangriira,
        "Kashtira Shangri-Ira",
        "Xyz/Effect Monster", "Psychic", "0/3000",
        "2+ Level 7 monsters\n" +
                "During each Standby Phase: You can Special Summon 1 \"Kashtira\" monster from your Deck. You can only use the previous effect of \"Kashtira Shangri-Ira\" once per turn. Each time a card(s) your opponent owns and possesses is banished face-down (except during the Damage Step): You can choose 1 unused Main Monster Zone or Spell & Trap Zone; ..."
    ),
    CardData(
        R.drawable.card_kashtira_birth,
        "Kashtira Birth",
        "Spell Card", "Continuous", "N/A",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_kashtira_preparations,
        "Kashtira Preparations",
        "Trap Card", "Continuous", "N/A",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_kashtira_riseheart,
        "Kashtira Riseheart",
        "Effect Monster", "Warrior", "1500/2100",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_kashtira_scareclaw,
        "Scareclaw Kashtira",
        "Effect Monster", "Psychic", "0/2600",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_kashtira_akstra,
        "Kashtira Akstra",
        "Spell Card", "Quick-Play", "N/A",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_kashtira_pressuredplanetwraitsoth,
        "Pressured Planet Wraitsoth",
        "Spell Card", "Field", "N/A",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_kashtira_kashtiratheosis,
        "Kashtiratheosis",
        "Spell Card", "Normal", "N/A",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_kashtira_bigbang,
        "Kashtira Big Bang",
        "Trap Card", "Normal", "N/A",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_kashtira_tearlaments,
        "Tearlaments Kashtira",
        "Effect Monster", "Psychic", "2300/1200",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_kashtira_overlap,
        "Kashtira Overlap",
        "Spell Card", "Quick-Play", "N/A",
        "More information about this card..."
    ),
)

val listCardMannadium = listOf<CardData>(
    CardData(
        R.drawable.card_mannadium_trilosukda,
        "Mannadium Trilosukda",
        "Synchro/Effect Monster", "Fairy", "2300/1200",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_mannadium_primeheart,
        "Mannadium Prime-Heart",
        "Synchro/Effect Monster", "Fairy", "3000/3000",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_mannadium_fearless,
        "Mannadium Fearless",
        "Tuner Monster", "Fairy", "0/2000",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_mannadium_meek,
        "Mannadium Meek",
        "Tuner Monster", "Fairy", "0/1800",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_mannadium_trid,
        "Mannadium Trid",
        "Tuner Monster", "Fairy", "0/15--",
        "More information about this card..."
    ),
)

val listCardDespia = listOf<CardData>(
    CardData(
        R.drawable.card_despia_adlibitum,
        "Ad Libitum of Despia",
        "Effect Monster", "Fairy", "1500/2000",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_despia_dramaturge,
        "Dramaturge of Despia",
        "Effect Monster", "Fairy", "3000/1500",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_despia_comedy,
        "Despian Comedy",
        "Effect Monster", "Fairy", "0/2000",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_despia_quaeritis,
        "Despian Quaertitis",
        "Fusion/Effect Monster", "Fiend", "2500/2500",
        "More information about this card..."
    ),
    CardData(
        R.drawable.card_despia_luluwalilith,
        "Despian Luluwalilith",
        "Synchro/Effect Monster", "Spellcaster", "2500/2500",
        "More information about this card..."
    ),
)
BANG Lite

Ciel projektu je naprogramovať zjednodušenú kartovú hru BANG ako **konzolovú** hru v jazyku Java.

## Úvod do hry

Hráči sa nachádzajú na divokom západe, a kedže sa jedná o zjednodušenú verziu hry, tak bojujú všetci proti sebe. V našej zjednodušenej verzií hry nemáme ani postavy, ani zbrane a veľa dalších kariet z pôvodnej hry.

## Cieľ hry

Zostať posledný nažive.

## Karty

V našej verzií hry sa nachádzajú dva typy kariet, a to **Modré** a **Hnedé** karty.

#### Modré karty

Modré karty po zahratí ležia pred hráčom, a ich efekt je trvajúci, až do ich odstránenia.

* 2x Barrel
* 1x Dynamit
* 3x Väzenie

#### Hnedé karty

Hnedé karty majú okamžitý efekt a po zahratí sa hneď odhadzujú do odhadzovacieho balíčka.

* 30x Bang
* 15x Vedľa
* 8x Pivo
* 6x Cat Balou
* 4x Dostavník
* 2x Indiáni

Efekty jednotlivých kariet sú popísané nižšie.

## Príprava hry

Hru môže hrať 2-4 hráčov. Každý hráč dostane na začiatku 4 karty z balíčka a začína so 4 životmi. Horný počet životov obmedzený nie je.

## Priebeh hry

Hráči hrajú postupne v rade za sebou. Ťah každého hráča sa delí na 3 časti, a to:
* 1. Tahanie kariet - na začiatku svojho ťahu si daný hráč potiahne 2 karty z balíčka. Pokiaľ má pred sebou nejakú efektovú kartu (Väzenie, Dynamit) vykonáva sa najskôr ich efekt.
* 2. Zahranie kariet - hráč môže zahrať ľubovolný počet kariet počas svojho ťahu, tak isto ale nemusí zahrať žiadnu. Počas tohto ťahu však musí byť splnené pravidlo, že pred hráčom môže ležať len jedna kópia každej karty (Príklad: Ak už má hráč pred sebou Barrel, nemôže pred seba vyložiť ďalší).
* 3. Odhadzovanie prebytočných kariet - hráč na konci svojho kola môže mať len toľko kariet v ruke, koľko má životov.

## Zabitie protivníka

Ak niektorí z hráčov zomrie, musí vrátiť všetky karty z ruky a zo stola pred sebou naspať do odhadzovacieho balíčka. Ak hráč zomrie zavinením iného hráča, môžte vymyslieť odmenu danému hráčovi za zabitie (Napríklad že si potiahne 2 karty. Táto úloha je nepovinná).

## Vysvetlenie jednotlivých kariet

#### Bang a Vedľa

Karty Bang predstavujú hlavný spôsob, ako znížiť počet životov svojim protihráčom. V našej zjednodušenej verzií hry môžete počas svojho ťahu týchto kariet zahrať neobmedzený počet.

Pokiaľ ste cielom karty Bang, automaticky zahráte kartu vedľa, pokiaľ žiadnu nemáte, strácate život. Pokiaľ stratíte všetky životy, vypadávate z hry.

Príklad ťahu v našej zjednodušenej verzií hry: Hráč A zahrá kartu Bang na Hráča B, Hráč B automaticky skontroluje či má kartu vedľa, pokiaľ takú kartu má, karta sa automaticky zahrá, pokiaľ takú kartu nemá, prichádza o život.

#### Barrel

Barrel je karta, ktorá vám dáva šancu skryť sa pred útokom karty BANG. Šanca na skytie je 1 ku 4.

Príklad ťahu: Niektorí z hráčov na vás vystrelí kartou BANG, a vy máte pred sebou Barrel, môžete skontrolovať jeho efekt, a môže sa vám podariť sa vyhnúť výstrelu, pokiaľ sa vám podarí sa mu vyhnúť, dalšie vyhodenie karty vedľa nie je potrebné, ak sa mu nevyhnete, hra ďalej automaticky kontroluje či máte kartu vedľa.

#### Pivo

Karta pivo dovoľuje hráčovi pridať si jeden život. Efekt karty sa dá použiť iba na aktuálne hrajúceho hráča.

#### Dostavník

Pomocou karty dostavník si hráč môže potiahnuť dve karty z balíčka.

#### Indiáni

Zahraním karty Indiáni spôsobíte útok indiánov na všetkých hráčov (okrem hráča ktorý ju zahral). Každý z hráčou odhodí kartu *Bang* (ak ju má) alebo príde o jeden život.

#### Cat Balou

Zahraním tejto karty môžete odhodiť kartu protivníkovi, či už zo stola alebo z ruky.

Príklad zahrania karty: Hráč A zahrá kartu Cat Balou na Hráča B, hra mu ponúkne či chce odhodiť kartu z ruky alebo zo stola, a po danom výbere sa Hráčovi B automaticky vyhodí náhodne zvolená karta. Pokiaľ Hráč B nemá žiadnu kartu, Hráčovi A sa ukáže hláška že túto kartu nemôže momentálne na daného hráča zahrať.

#### Väzenie

Túto kartu dávate pred ľubovoného iného hráča, a danou kartou ho uväzníte. Pokiaľ má hráč pred začiatkom svojho kola pred sebou kartu Väzenie, musí skontrolovať jej efekt, či sa mu podarí z neho ujsť alebo nie. Šanca na újdenie z väzenia je 1 ku 4. Ak sa mu z väzenia nepodarí ujsť - vynecháva dané kolo, pokiaľ z neho ujde, pokračuje vo svojom ťahu. V oboch prípadoch sa karta po kontrole jej efektu vyhadzuje do odhadzovacieho balíčka.

#### Dynamit

Túto kartu pri zahratí vykladáte pred seba. Efekt karty Dynamit sa kontroluje vždy na začiatku kola, pokiaľ dynamit vybuchne pred vami, strácate 3 životy a karta sa odhadzuje do balíčka. Pokiaľ vám dynamit nevybuchne, karta sa posúva hráčovi, ktorý hral pred vami (Dynamit sa posúva opačným smerom, akým prebieha hra). Šanca na vybuchnutie dynamitu je 1 ku 8;

Pokiaľ by nastala situácia, že hráč má na začiatku kola pred sebou aj kartu Väzenie aj Dynamit, kontroluje sa najskôr efekt karty Dynamit a až potom Väzenie.

## Zdroje (pre lepšie pochopenie hry)
* [Pravidlá pôvodnej hry](https://eshop.albi.cz/data/files/products/24327/1603711687-bang-pravidla-zakladni-hry.pdf)

# --------------------------------
BANG Lite

Task is to create a simplified version of card game "BANG" as a **console** game in Java.

## Introduction to the game

The players are in the wild west, and since this is a simplified version of the game, they all fight against each other. In our simplified version of the game, we have neither characters nor weapons and also we don't have many other cards from the original game.

## Goal of the game

Be the last one alive.

## Cards

In our version of the game, there are two types of cards, **Blue** and **Brown** cards.

#### Blue cards

After playing blue card, blue card lie in front of the player, and their effect is permanent until they are removed.

* 2x Barrel
* 1x Dynamite
* 3x Prison

#### Brown cards

Brown cards have an immediate effect and are immediately discarded into the discard pile after being played.

* 30x Bang
* 15x Missed
* 8x Beer
* 6x Cat Balou
* 4x Stagecoach
* 2x Indians

The effects of each card are described below.

## Game preparation

The game can be played by 2-4 players. Each player starts with 4 cards from the deck and starts with 4 lives. The upper number of lives is not limited.

## The course of the game

Players play sequentially in a row. Each player's turn is divided into 3 parts:
* 1. Drawing cards - at the beginning of his turn, the given player draws 2 cards from the deck. If he has blue cards (Prison, Dynamite) in front of him, their effect is excecuted as first.
* 2. Playing cards - the player can play any number of cards during his turn, but he does not have to play any. During the move, however, the rule must be fulfilled that only one copy of each card can lie in front of the player (Example: If you already have a Barrel in front of you, you cannot place another one in front of you).
* 3. Discarding excess cards - a player can only have as many cards in his hand as he has lives at the end of his turn.

## Killing an opponent

If any of the players die, they must return all the cards from their hand and from the table in front of them and put them in the discard pile. If a player is killed by another player, you can come up with a reward for the player who did kill (For example, he draws 2 cards, this task is optional).

## Explanation of individual cards

#### Bang and Missed

Bang cards are the main way to reduce the health of your opponents. In our simplified version of the game, you can play an unlimited number of these cards during your turn.

If you are a target of a Bang card, you can immediately play a card Missed to discard the effect of the Bang card, if you don't have one, you lose a life. If you lose all lives, you are out of the game.

An example of a move in our simplified version of the game: Player A plays a Bang card to Player B, Player B automatically checks if he has a card Missed on hand, if he has such a card, the card is automatically played, if he does not have, he loses a life.

#### Barrel

Barrel is a card that gives you a chance to hide from a BANG card attack. The chance of a Barrel is 1 in 4.

Example move: Some of the players shoot a BANG card at you, and you have a Barrel in front of you, you can check its effect, and you may manage to avoid the shot, as long as you manage to avoid it, another discard of Missed card is not necessary, if you cannot avoid it, the game automatically checks whether you have a card Missed.

#### Beer

The beer card allows the player to add one life. The effect of the card can only be applied to the currently playing player.

#### Stagecoach

Using the stagecoach card, the player can draw two cards from the deck.

#### Indians

By playing the Indians card, you cause an Indian attack on all players (except the player who played it). Each player must use a *Bang* card or lose one life.

#### Cat Balou

By playing this card, you can discard a card of your opponent, either from the table or from your hand.

Example of playing a card: Player A plays the Cat Balou card to Player B, the game offers him whether he wants to discard a card from his hand or from the table, and after the given choice, a randomly selected card is automatically discarded from Player B. If Player B has no cards, Player A will be shown a message that he cannot currently play this card on that player.

#### Prison

You put this card in front of any player, and you will trap him with this card. If a player has a Prison card in front of him before the start of his turn, he must check its effect to see if he manages to escape from it or not. The chance of escaping from prison is 1 in 4. If he fails to escape from prison, he skips the turn, if he does, he continues his turn. In both cases, the card is discarded into the discard pile after checking its effect.

#### Dynamite

You place this card in front of you when you play it. The effect of the Dynamite card is always checked at the beginning of the turn, if the dynamite explodes in front of you, you lose 3 life and the card is discarded into the deck. Unless your dynamite explodes, the card moves to the player who played before you (Dynamite moves in the opposite direction of the game). The dynamite has a 1 in 8 chance of exploding.

If the situation should arise that the player has both a Prison and Dynamite card in front of him at the beginning of the round, the effect of the Dynamite card is checked first and only then the Prison card.

## Resources (for better understanding of the game)
* [Rules of the original game](https://www.ultraboardgames.com/bang/game-rules.php)

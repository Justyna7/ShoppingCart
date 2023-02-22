# Zadanie: Koszyk Internetowy
(English translation below)
| Termin oddania | Punkty     |
|----------------|:-----------|
| 13.05.2022  23:00   |  10        |

--- 
Przekroczenie terminu o **n** zajęć wiąże się z karą:
- punkty uzyskania za realizację zadania są dzielone przez **2<sup>n</sup>**.

--- 

Twoja firma dostała zlecenie na stworzenie oprogramowania dla dużego sklepu internetowego *JavaMarkt*. 
Jedną z podstawowych funkcjonalności jest oprogramowanie koszyka zakupów, 
który potrafi uwzględniać różne promocje, rabaty oraz oferty specjalne, takie jak:
- jeśli wartość zamówienia jest większa niż 300 zł klient otrzymuje 5% zniżki na zakupione towary
- jeśli klient kupi 2 produkty to 3 najtańszy otrzymuje gratis
- jeśli wartość zamówienia przekracza wartość 200 zł klient otrzymuje firmowy kubek gratis
- jednorazowy kupon rabatowy 30% na wybrany produkt
oraz wiele innych jeszcze nieznanych na tym etapie implementacji. 
Promocje mogą się zmieniać w trakcie działania programu, tj. mogą się pojawiać nowe a istniejące mogą znikać.

Towary w koszyku powinny być posegregowane malejąco według ceny, 
a potem według kolejności alfabetycznej nazw produktów. 
Sposób sortowania może produktów może się zmieniać w trakcie działania programu. 

Twoim zadaniem jest zaimplementowanie logiki, operującej na obiektach typu ``Product``, 
która umożliwiałaby:
1. Wyszukiwanie najtańszego/najdroższego produktu w zadanej kolekcji produktów
2. Wyszukiwanie n najtańszych/najdrożyszych produktów w zadanej kolekcji produktów
3. Sortowanie kolekcji produktów po cenie jak i po nazwie
4. Wyliczanie sumy cen wszystkich zadanych produktów
6. Aplikowanie opisanych powyżej rodzajów promocji na zadanej kolekcji produktów w koszyku

Cechy związane z klasą ``Product``:
- kod produktu (code) - String
- nazwa produktu (name) - String
- cena produktu (price) – double
- cena produktu po uwzględnieniu promocji (discountPrice) - double

W tym zadaniu użyj tablicy produktów jako kolekcji, na której będziesz operował.

---

### Uwaga 1
Projekt powinien zawierać odpowiednie testy jednostkowe do implementowanej funkcjonalności.

### Uwaga 2
Implementując koszyk i promocje zwróć uwagę na wzorzec projektowy [Command](https://www.oodesign.com/command-pattern.html).

### Uwaga 3
Planując mechanizm sortowania zwróć uwagę na [Dependency Inversion Principle](https://www.oodesign.com/dependency-inversion-principle.html) oraz 
interfejsy dostępne w Java: ``Comparable`` oraz ``Comparator``.

---
# Exercise: Online Shopping Cart
(English translation of Polish requirements above)
| Deadline | Max Points     |
|----------------|:-----------|
| 13.05.2022  23:00   |  10        |

--- 
Missing the deadline by **n** lessons gives penalty:
- points obtained for solving the excercise are divided by **2<sup>n</sup>**.

--- 

Your company recieved instructions to create software for a big online shop *JavaMarkt*.
One of basic functionalities is sotware for shopping cart, which is able to take into account different discounts and special offers such as:
- if value of an order is higher than 300 PLN, client recieves 5% discount on purchased goods
- if client buys 2 products, third product (the cheapest) will be given for free
- if value of an order is higher than 200 PLN, client will recieve a company mug for free
- single use coupon with 30% discount on chosen product
and other special offers not known yet at this implementation stage.
Special offers and disscounts may change while the program is running as in - new ones may be added and existing ones may be removed.

Goods in the cart should be sorted by prize in descending order, and then by product name in alphabetical order.
Sorting order should be able to change while the program is running.

Your task is to implement the logic operating on obcjects of type ``Product``,
which will allow to:
1. Find the cheapest/the most expensive product in a given collection of products
2. Find n cheapest/the most expensive products in a given collection of products
3. Sort a given collection of products by prize and by name
4. Count the sum of prizes of all given products
6. Apply special offers and disscounts described above to the given collection of products in the cart

Characteristics associated with class ``Product``:
- code - String
- name - String
- price – double
- discountPrice - (the prize of product after applying the discount) - double

In this exercise use an array of products as a collection on which you will operate.

---

### Note 1
Project should contain appropriate unit tests for implemented funcionalities.

### Note 2
While implementing the cart and disscounts pay attention to command pattern [Command](https://www.oodesign.com/command-pattern.html).

### Note 3
While planning sorting mechanism pay attention to [Dependency Inversion Principle](https://www.oodesign.com/dependency-inversion-principle.html) and 
interfaces avalible in Java: ``Comparable`` and ``Comparator``.

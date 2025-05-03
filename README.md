

# **Kelime Tahmin Oyunu**

Bu program, bir dosyadaki kelimelerden rastgele birini seçerek, oyuncuya harf tahminleri yapma imkanı sunar. Oyuncunun amacı, seçilen kelimeyi doğru tahmin etmektir. Oyuncuya belirli sayıda hak verilir ve yanlış tahminlerde bu haklar azalır.

## **Özellikler:**

* **Kelime Seçimi:** Program, `D:\\dosya.txt` dosyasından kelimeler alır ve bunlardan rastgele bir kelime seçer.
* **Harf Tahmini:** Oyuncu bir harf tahmin eder. Her doğru tahmin, o harfi kelimenin yerine yerleştirir.
* **Can Sayısı:** Her yanlış tahminde oyuncunun canı azalır. Can sayısı, kelimenin uzunluğu kadar başlar.
* **Kelimeyi Tahmin Etme:** Eğer oyuncu tüm harfleri doğru tahmin ederse, oyun biter ve oyuncuya tebrikler mesajı gösterilir.
* **Oyunun Bitmesi:** Eğer oyuncunun canı biterse, oyun sona erer ve doğru kelime gösterilir.

## **Gereksinimler:**

* Java 8 veya daha yeni bir sürüm.
* `D:\\dosya.txt` dosyasındaki kelimelerin bulunduğu bir metin dosyası.

## **Kullanım:**

1. `D:\\dosya.txt` dosyasını oluşturun ve içinde kelimeler bulundurun (her kelime bir satırda olmalı).
2. Programı çalıştırın.
3. Oyuncu, ekrana yazan talimatları takip ederek harf tahminlerinde bulunur.
4. Doğru tahmin ile oyunu kazanın ya da canlarınız bitene kadar kelimeyi tahmin etmeye çalışın.


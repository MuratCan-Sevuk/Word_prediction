Kelime Tahmin Oyunu (Java)

Bu proje, bir dosyadan rastgele kelime seçerek kullanıcının bu kelimeyi harf tahminleriyle bulmaya çalıştığı basit bir kelime tahmin oyunudur.

--Özellikler--

Dosyadan Kelime Okuma: dosya.txt içerisindeki kelimeler okunur ve rastgele bir kelime seçilir.

Harf Tahmini: Kullanıcı, harf tahminleri yaparak kelimeyi bulmaya çalışır.

Can Sistemi: Kullanıcının, kelimenin uzunluğu kadar canı vardır.

Yanlış Tahmin Bildirimi: Kullanıcı yanlış tahmin yaptığında canı azalır.

Oyunun Sonlanması: Kullanıcı kelimeyi tamamen tahmin ederse kazanır, tüm canlarını kaybederse kaybeder.

--Kullanım--

1. Dosya Hazırlığı

Öncelikle, kelimeleri içeren bir dosya.txt dosyası oluşturun ve proje dizinine veya belirtilen dosya yoluna ekleyin.
Örnek içerik:

elma armut muz çilek karpuz

2. Kodun Çalıştırılması

Bu Java dosyasını çalıştırmadan önce, dosya yolunu güncelleyin. Örneğin:

File file = new File("D:\\dosya.txt");

Dosyanız başka bir konumdaysa, bu yolu kendi sisteminize göre düzenleyin.

3. Oynanış

-Program, dosya.txt içinden rastgele bir kelime seçecektir.

-Kullanıcı, her turda bir harf tahmin eder.

-Doğru tahmin edilen harfler ekranda gösterilir.

-Yanlış tahmin yapılırsa can azalır.

-Tüm harfler doğru tahmin edilirse kullanıcı kazanır.

-Canlar bitince oyun sona erer ve doğru kelime ekrana yazılır.

--Gereksinimler--

Java 8 veya üzeri

dosya.txt dosyasının doğru dizinde olması

--Lisans--

Bu proje MIT lisansı ile lisanslanmıştır. Dilediğiniz gibi kullanabilir ve geliştirebilirsiniz.

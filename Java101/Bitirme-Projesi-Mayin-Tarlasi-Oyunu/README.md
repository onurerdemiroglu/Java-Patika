# Bitirme Projesi - Mayın Tarlası Oyunu

> Java dilinde Mayın Tarlası oyunu yapınız.

### Oyun Kuralları :

- Oyun metin tabanlıdır.
- Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
- Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
- Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
- Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
- Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
- Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
- Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
- Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
 
### Yazılım Öngörünüm : 

![out](https://user-images.githubusercontent.com/35347777/141342555-abe77592-5d34-4a0a-be11-bca9eafc7e21.gif)

  
### Kaybetme Senaryosu :

![loss](https://user-images.githubusercontent.com/35347777/141373854-aef31376-2f2e-4aa9-8b44-d223570a61b4.gif)


### Kazanma Senaryosu :

![win](https://user-images.githubusercontent.com/35347777/141374005-dfb86730-50ef-4dda-9640-33f6c8ef261a.gif)

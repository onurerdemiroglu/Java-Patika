# ÖDEV - Uçak Bileti Fiyatı Hesaplama

> Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

- [x]   Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
- [x]   Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
- [x]   Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
- [x]   Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
- [x]   Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. 
<br>


## Senaryolar
 
>   Senaryo 1
 
*Mesafeyi km türünden giriniz : 1500<br>
Yaşınızı giriniz : 20<br>
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2<br> 
Toplam Tutar = 216 TL*

>   Senaryo 2 

*Mesafeyi km türünden giriniz : -500<br>
Yaşınızı giriniz : 1<br>
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77<br>
Hatalı Veri Girdiniz !*

>   Senaryo 3 

*Mesafeyi km türünden giriniz : 200<br>
Yaşınızı giriniz : 35<br>
Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1<br> 
Toplam Tutar = 20.0 TL*
 
<br>

![out](https://user-images.githubusercontent.com/35347777/138612520-ad941199-4d3c-4e16-81c7-423601458e48.gif)

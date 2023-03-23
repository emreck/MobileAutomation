# Case Study

BDD yaklaşımıyla,java progralama dilinde mobil otomasyon caseleri gerçekleştirildi.
Gerçekleştirilen otomasyon projesi, tanımlanan 2 farklı emülatörde paralel olarak testleri yürütmektedir.
feature dosyasındaki senaryolarda "@tag" yapısı kullanılarak istenen senaryoların yürütülmesi sağlanabilmektedir.
Koşum raporlarının görüntülenebilmesi için allure report kullanılmıştır.


Farklı cihazlarda appium server yönetiminin yapılabilmesi için ilk olarak aşağıdaki stepler uygulanmalıdır :
1- resources dosyası "C" dizini altına taşınmalıdır.
2- Node1 ve Node2 json dosyaları içerisinde, localde başlatılacak cihazların capability bilgisi yer almakta.
Bu iki dosya editörde açılarak, capability bilgileri güncellenip kaydedilmelidir.

3-server.bat dosyası ve sonrasında Node1 ve Node2 bat dosyaları sırasıyla çalıştırılmalıdır.(.bat dosyalarında port konfigrasyonları ve hub yönetimi için selenium server standalone jar ı çalıştılmaktadır. Içerik text editöründe görüntülebilir.)

4-parallel.xml dosyası çalıştırılmalıdır.

5-Allure report sonuçları için : report sonuçlarının bulunduğu dosya dizininde "allure serve allure-report" Komutu çalıştırılmalıdır.

Örnek koşum videosu aşağıda paylaşılmıştır :



[Screen.webm](..%2F..%2FEkran%20kayd%FD%2FScreen.webm)
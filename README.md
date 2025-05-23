# AndroidBaseApp

Jetpack Compose tabanlı modern bir Android uygulama yapısı.

## ✨ Özellikler

- ✅ **Jetpack Compose UI** desteği
- 🌗 **Dark / Light Tema Desteği**
  - Kullanıcının seçimlerine göre tema dinamik olarak değişir
  - `Switch` bileşeni ile kullanıcı temayı değiştirebilir
- 🎨 **Özelleştirilebilir Tema Renkleri**
  - Light ve Dark modlar için özel `ColorScheme` tanımı
  - Uygulama genelinde tema renklerini kullanmak için `AndroidBaseAppTheme.colors`
- 🧭 **Navigation Destekli BottomBar**
  - `NavigationBar` ve `NavigationBarItem` kullanımı
  - Seçili sekmede özel ikon ve metin rengi (örneğin: beyaz)
  - Arka plan ve seçili oval efekt kaldırılmış
- 🔧 **Hilt ViewModel Entegrasyonu**
  - Her composable'da bağımlılık enjeksiyonu kolayca yapılabilir
- 💾 **DataStore ile Kalıcı Ayarlar**
  - Tema tercihi gibi kullanıcı ayarları kalıcı olarak saklanır

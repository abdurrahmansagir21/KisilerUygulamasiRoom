# KİŞİLER UYGULAMASI (ROOM)

Bu proje, modern Android geliştirme prensipleri kullanılarak geliştirilmiş bir **rehber (kişiler) uygulamasıdır**.
Kullanıcılar kişileri kaydedebilir, görüntüleyebilir, güncelleyebilir, silebilir ve arama yapabilir.

Uygulama, **MVVM (Model-View-ViewModel)** mimarisi ile yazılmış olup **Kotlin** dilinde geliştirilmiştir.
Veritabanı işlemleri için **Room**, bağımlılık yönetimi için ise **Hilt** kullanılmıştır.


## Özellikler

* Kişi ekleme
* Kişi listeleme
* Kişi güncelleme
* Kişi silme
* İsimle arama yapma


## Kullanılan Teknolojiler

* **Kotlin:** Uygulamanın ana dili
* **MVVM Mimarisi:** Veri ve kullanıcı arayüzü ayrımı
* **Room Persistence Library:** SQLite veritabanı işlemleri
* **Hilt (Dagger):** Bağımlılık enjeksiyonu
* **Android Jetpack Bileşenleri:**

  * `ViewModel`
  * `LiveData`
  * `Navigation Component`
* **Coroutines:** Asenkron işlemler
* **ViewBinding:** XML view’larına güvenli erişim


## Mimari Yapı

Proje, Google’ın önerdiği katmanlı mimariye uygundur:

* **UI Katmanı (Fragments):**
  `AnasayfaFragment`, `KisiKayitFragment`, `KisiDetayFragment`
  → Kullanıcı etkileşimlerini alır ve ViewModel’e iletir.

* **ViewModel Katmanı:**
  `AnasayfaViewModel`, `KisiKayitViewModel`, `KisiDetayViewModel`
  → UI için verileri hazırlar ve durumu yönetir.

* **Repository Katmanı:**
  `KisilerRepository`
  → Verilerin hangi kaynaktan alınacağını belirler.

* **Data Katmanı (DataSource & Room):**
  `KisilerDataSource` ve Room bileşenleri
  → CRUD (Create, Read, Update, Delete) işlemleri yapılır.


## Kurulum ve Çalıştırma

```bash
git clone https://github.com/abdurrahmansagir21/KisilerUygulamasiRoom.git
```

1. Projeyi Android Studio’da aç
2. Gradle bağımlılıklarının yüklenmesini bekle
3. Emülatörde veya cihazda çalıştır


## Ekran Görüntüleri

<p align="center">
  <img width="250" src="https://github.com/user-attachments/assets/f6514e7d-e0f4-4108-9c34-fa2e64d9e8b5" />
  <img width="250" src="https://github.com/user-attachments/assets/0a2a2db0-6069-4c39-a449-2cc7f80e5e64" />
  <img width="250" src="https://github.com/user-attachments/assets/56337bd8-5695-401e-af32-0d56e2c8b19c" />
</p>


# CONTACTS APP (ROOM)

This project is a **Contacts (Phonebook) App** developed using modern Android development principles.
Users can add, view, update, delete, and search for contacts.

The app follows the **MVVM (Model-View-ViewModel)** architecture and is written in **Kotlin**.
It uses **Room** for local database operations and **Hilt** for dependency injection.


## Features

* Add new contacts
* List all contacts
* Update existing contacts
* Delete contacts
* Search by name


## Technologies Used

* **Kotlin:** Main programming language
* **MVVM Architecture:** Separation of UI and business logic
* **Room Persistence Library:** SQLite database abstraction
* **Hilt (Dagger):** Dependency injection
* **Android Jetpack Components:**

  * `ViewModel`
  * `LiveData`
  * `Navigation Component`
* **Coroutines:** For asynchronous operations
* **ViewBinding:** Safe access to XML views


## Architecture Overview

The project follows a clean, layered architecture:

* **UI Layer (Fragments):**
  `AnasayfaFragment`, `KisiKayitFragment`, `KisiDetayFragment`
  → Handles user interactions and communicates with ViewModel.

* **ViewModel Layer:**
  `AnasayfaViewModel`, `KisiKayitViewModel`, `KisiDetayViewModel`
  → Prepares and manages data for the UI.

* **Repository Layer:**
  `KisilerRepository`
  → Central data management and data source selection.

* **Data Layer (DataSource & Room):**
  `KisilerDataSource` and Room components
  → Handles CRUD operations.


## Installation and Run

```bash
git clone https://github.com/abdurrahmansagir21/KisilerUygulamasiRoom.git
```

1. Open the project in Android Studio
2. Wait for Gradle dependencies to sync
3. Run the app on an emulator or a physical device


## Screenshots

<p align="center">
  <img width="250" src="https://github.com/user-attachments/assets/f6514e7d-e0f4-4108-9c34-fa2e64d9e8b5" />
  <img width="250" src="https://github.com/user-attachments/assets/0a2a2db0-6069-4c39-a449-2cc7f80e5e64" />
  <img width="250" src="https://github.com/user-attachments/assets/56337bd8-5695-401e-af32-0d56e2c8b19c" />
</p>

---

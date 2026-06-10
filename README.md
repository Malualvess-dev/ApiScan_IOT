# 🌱 AgroScan API

## 📖 Sobre o Projeto

A AgroScan API é uma aplicação desenvolvida em Java com Spring Boot responsável por receber, armazenar e disponibilizar dados enviados por dispositivos IoT.

A solução permite o monitoramento de informações ambientais coletadas pelo ESP32, oferecendo endpoints para consulta e integração com um dashboard web.

---

## 🚀 Tecnologias Utilizadas

- ☕ Java 21
- 🍃 Spring Boot
- 🔗 Spring Web
- 🗄️ Spring Data JPA
- 📚 Swagger OpenAPI
- ⚙️ Gradle
- 🌐 HTML, CSS e JavaScript
- 🔌 Ngrok

---

## 📂 Estrutura do Projeto

```text
src
 └── main
      ├── java
      │    ├── controller
      │    ├── dto
      │    ├── model
      │    ├── repository
      │    └── service
      │
      └── resources
           └── static
                └── dashboard.html
```

---

## ✨ Funcionalidades

✅ Recebimento de dados do ESP32

✅ Consulta de status atual

✅ Histórico de leituras

✅ Dashboard web integrado

✅ Documentação automática via Swagger

---

## 🔗 Endpoints

### Registrar Leitura

```http
POST /scanner/dados
```

### Consultar Status

```http
GET /scanner/status
```

### Consultar Histórico

```http
GET /scanner/historico
```

---

## 📦 Exemplo de Payload

```json
{
  "categoria": "Verdura",
  "temperatura": 24.00,
  "umidadeAr": 40.00,
  "umidadeSolo": 51
}
```

---

## 📊 Dashboard

A aplicação disponibiliza um dashboard para visualização das informações recebidas.

```text
http://localhost:8080/dashboard.html
```

---

## 📚 Swagger

Documentação disponível em:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## ▶️ Como Executar

### Clonar o projeto

```bash
git clone URL_DO_REPOSITORIO
```

### Entrar na pasta

```bash
cd AgroScan_API
```

### Executar a aplicação

```bash
gradlew bootRun
```

---

## 🌐 Integração com IoT

Para comunicação com o ESP32 utilizando o Wokwi:

```bash
ngrok http 8080 --scheme=http
```

Atualize a URL do dispositivo com o endereço gerado pelo Ngrok.

---

## 🎯 Resultado Esperado

- Dados recebidos pela API
- Dashboard atualizado automaticamente
- Histórico de leituras disponível
- Retorno HTTP 200 para o dispositivo IoT

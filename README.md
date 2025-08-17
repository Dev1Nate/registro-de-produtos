# 🛠️ Registro de Produtos

Aplicação **Java console** desenvolvida para praticar conceitos de **orientação a objetos, herança e polimorfismo**.  
O sistema permite registrar diferentes tipos de produtos (**comuns, usados e importados**) e exibir suas etiquetas de preço personalizadas.

---

## 📚 Tecnologias utilizadas

- Java 17+
- Programação Orientada a Objetos (POO)
- Herança, polimorfismo e sobrescrita de métodos
- `java.util.List`
- `java.time.LocalDate`
- `java.time.format.DateTimeFormatter`

---

## ⚙️ Como executar

### Pré-requisitos
- Java JDK 17+ instalado
- IDE ou terminal configurado para compilar e executar programas Java

### Passos
```bash
# Clone o repositório
git clone https://github.com/Dev1Nate/registro-de-produtos.git

cd registro-de-produtos

# Compile os arquivos
javac Main.java entities/*.java

# Execute o programa
java Main
```

---

## 📌 Funcionalidades

- Registrar produtos informando:
  - Tipo (**Comum, Usado ou Importado**)
  - Nome
  - Preço
  - Data de fabricação (se usado)
  - Taxa alfandegária (se importado)
- Exibir etiquetas de preço personalizadas com base no tipo de produto.

---

## 🔗 Exemplo de uso

### Entrada
```
Enter The Number Of Products: 3
Product #1 data:
Common,Used or Imported(c/u/i)? c
Name: Notebook
Price: 1100.00
Product #2 data:
Common,Used or Imported(c/u/i)? u
Name: iPhone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2017
Product #3 data:
Common,Used or Imported(c/u/i)? i
Name: Tablet
Price: 700.00
Customs Fee: 60.00
```

### Saída
```
Price Tags
Notebook, $ 1100.0
iPhone (Used) $ 400.0 (Manufacture Date: 15/03/2017)
Tablet, $ 760.0 (Custom Fee: $ 60.0)
```

---

## 📂 Estrutura do projeto

```
src/
 ├─ Main.java
 └─ entities/
     ├─ Product.java
     ├─ UsedProduct.java
     └─ ImportedProduct.java
```

---

## 🎯 Conceitos aplicados

- **Herança**: `UsedProduct` e `ImportedProduct` herdam de `Product`.  
- **Polimorfismo**: método `priceTag()` é sobrescrito em subclasses para comportamento diferente.  
- **Encapsulamento**: atributos privados com getters/setters.  
- **Listas**: produtos armazenados em `List<Product>`.

---

# trabalho-loja-virtual


### Instalação Docker

```sh
docker build -t loja-virtual .
```
```sh
docker run -p 9990:9990 -p 8080:8080 loja-virtual
```

### URLS


#### Produtos disponíveis

```sh
LISTAGEM DE PEDIDOS

GET =>	http://localhost:8080/loja-virtual/produtos
```
```sh
CRIA UM PEDIDO COM O PRODUTO ENVIADO VIA POST

POST =>	http://localhost:8080/loja-virtual/pedidos
```

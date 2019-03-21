# Configurando Redis com docker 

## Subindo docker redis
### Baixando imagem do docker 
  ```
  sudo docker pull redis:5.0.4
  ```  

## Iniciando conteiner a partir da imagem baixada 
  ```
  sudo docker run -d -p 6379:6379 -i -t redis:5.0.4
  ```  

## Entrando dentro do docker para utilizar o client 
  ```
  docker container exec -it stoic_franklin /bin/bash
  ```

## Rodar o redis client, dentro do docker do redis
   ```
   redis-cli
   ```

## Inserindo valores no redis pelo redis-cli, inserir chave e o valor em seguida 
   ```
   set "token" "lçsljdoçaawidiaiwhd98w8w92893"
   ```

## Update, mesma situação, chave existente e o novo valor
   ```
   set "token" "sakndkalnsdayrwiiew"
   ```

## Recuperar o valor, digitar nome da chave
   ```
   get "token"
   ```

## Buscar todas chaves existentes 
   ```
   keys *
   ```

## Determinar o tempo de expiracao da chave em segundos
  ```
  expire "token" 60
  ```
 
## Verificar o tempo de expiração pela chave 
  ```
  ttl "token"
  ```
 
## Renovar o tempo de expiracao do valor pela chave 
   ```
	expire "token"
   ``` 

## Deletar o valor de uma chave 
```
del "token"
 ``` 

## Adicionando um hash 
   ```
   hset usuario "senha" "1232131"
   ```

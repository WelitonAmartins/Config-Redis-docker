# Configurando Redis com docker 

## Subindo docker redis
### baixando imagem do docker 
`sudo docker pull redis:5.0.4`  

## iniciando conteiner a partir da imagem baixada 
`sudo docker run -d -p 6379:6379 -i -t redis:5.0.4`  

## entrando dentro do docker para utilizar o client 
`docker container exec -it stoic_franklin /bin/bash`

## rodar o redis client, dentro do docker do redis
`redis-cli`

# #Inserindo valores no redis pelo redis-cli
##inserir chave e o valor em seguida 
`set "token" "lçsljdoçaawidiaiwhd98w8w92893"`

## Update, mesma situação, chave existente e o novo valor
`set "token" "sakndkalnsdayrwiiew"`

## Recuperar o valor, digitar nome da chave
`get "token"`

## buscar todas chaves existentes 
`keys *`

## determinar o tempo de expiracao da chave em segundos
 `expire "token" 60`
 
## verificar o tempo de expiração pela chave 
 `ttl "token" `
 
## renovar o tempo de expiracao do valor pela chave 
 `expire "token"` 

## deletar o valor de uma chave 
 `del "token"` 
 

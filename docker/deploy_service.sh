#!/bin/bash

docker stop service-clientes && docker rm service-clientes

docker rmi 134219192027.dkr.ecr.us-east-1.amazonaws.com/reto-tpo/service-clientes

eval $(aws ecr get-login --no-include-email --region us-east-1)

docker run --name service-clientes \
           -d \
           --restart unless-stopped \
           -p 8080:8080 \
           134219192027.dkr.ecr.us-east-1.amazonaws.com/reto-tpo/service-clientes

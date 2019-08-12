#!/bin/bash

docker build -t 134219192027.dkr.ecr.us-east-1.amazonaws.com/reto-tpo/service-clientes \
      -f docker/Dockerfile \
      .

eval $(aws ecr get-login --no-include-email --region us-east-1)

docker push 134219192027.dkr.ecr.us-east-1.amazonaws.com/reto-tpo/service-clientes
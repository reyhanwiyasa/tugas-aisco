#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.apakah --module-path aisco.product.apakah -m aisco.product.apakah &

wait
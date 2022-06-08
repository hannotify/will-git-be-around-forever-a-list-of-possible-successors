FROM rust:latest
RUN apt-get update
RUN apt-get install -y make libsodium-dev libclang-dev pkg-config libssl-dev libxxhash-dev libzstd-dev clang
RUN cargo install pijul --version "~1.0.0-beta"
RUN export PATH="\$PATH:$HOME/.cargo/bin/"


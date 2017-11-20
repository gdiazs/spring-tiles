module.exports = {
    entry: "./src/main/webapp/resources/js/app/index.js",
    output: {
        path: __dirname + "/src/main/webapp/resources/js",
        filename: "bundle.js"
    },
    module: {
        loaders: [
            { test: /\.css$/, loader: "style!css" }
        ]
    }
};
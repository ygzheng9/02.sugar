const { src, dest, watch, parallel, series } = require('gulp');
const sourcemaps = require('gulp-sourcemaps');
const babel = require('gulp-babel');
const uglify = require('gulp-uglify-es').default;
const del = require('del');

var concat = require('gulp-concat');
var concatCss = require('gulp-concat-css');

const jsSrc = './js/**/*.js';
const jsTarget = '../webapp/assets/js';

// const jsTarget = './dist';

// 2020/04/05
// 1. 只处理 js es2015 -> es5 ，并且是单文件，不打包；
// 2. 使用 layui 的 模块机制；在 ./js/lay-config.js 中配置模块的目录；
// 3. 如果要打包，使用 webpack；

function compile() {
    return src(jsSrc)
        .pipe(sourcemaps.init())
        .pipe(
            babel({
                presets: ['@babel/preset-env']
            })
        )
        .pipe(dest(jsTarget))
        .pipe(sourcemaps.write('.'));
}
exports.compile = compile;

function build() {
    return src(jsSrc)
        .pipe(
            babel({
                presets: ['@babel/preset-env']
            })
        )
        .pipe(uglify())
        .pipe(dest(jsTarget));
}
exports.build = build;

function clean(cb){
    del(['../webapp/assets/js/**/*', '!../webapp/assets/js'], { force: true });
    cb();
}
exports.clean = clean;


function dev() {
    watch(jsSrc, { delay: 500 }, series('compile'));
}
exports.dev = dev;
